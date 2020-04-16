import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Portfolio} from "./portfolio/portfolio.component";

@Injectable({
  providedIn: 'root'
})
export class PortfolioService {
  private readonly portfolioUrl: string;

  constructor(private http: HttpClient) {
    this.portfolioUrl = 'http://localhost:8080/portfolio';
  }


  public findAll(): Observable<Portfolio[]> {
    return this.http.get<Portfolio[]>(this.portfolioUrl);
  }


}




