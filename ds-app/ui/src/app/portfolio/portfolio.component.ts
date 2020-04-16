import {HttpClient} from '@angular/common/http';
import {Component} from '@angular/core';

@Component({
  selector: 'app-scooter',
  templateUrl: './portfolio.component.html',
  styleUrls: ['./portfolio.component.css']
})
export class PortfolioComponent {

  constructor(private httpClient: HttpClient) {
    this.getAllImages();
  }

  retrievedPortfoliosEven: Portfolio[] = [];
  retrievedPortfoliosOdd: Portfolio[] = [];
  retrieveResponse: any;

  getAllImages() {
    this.httpClient.get('http://localhost:8080/portfolio')
      .subscribe(
        res => {
          this.retrieveResponse = res;
          for (var i = 0; i < this.retrieveResponse.length; i++) {
            i % 2 == 0
              ? this.retrievedPortfoliosEven.push(this.retrieveResponse[i])
              : this.retrievedPortfoliosOdd.push(this.retrieveResponse[i]);
          }
        }
      );
  }
}

export interface Portfolio {
  name: String;
  description: String;
  picBytes: String;
}

