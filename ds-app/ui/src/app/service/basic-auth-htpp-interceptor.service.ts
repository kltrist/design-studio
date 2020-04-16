import {Injectable} from '@angular/core';
import {HttpHandler, HttpInterceptor, HttpRequest} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BasicAuthHtppInterceptorService implements HttpInterceptor {
  constructor() {
  }

  intercept(req: HttpRequest<any>, next: HttpHandler) {
    if (sessionStorage.getItem('username') && sessionStorage.getItem('token')) {
      req = req.clone({
        setHeaders: {
          Authorization: sessionStorage.getItem('token')
        }
      });
      req = req.clone({headers: req.headers.set('Access-Control-Allow-Methods', 'POST, GET, OPTIONS, DELETE, PUT, OPTIONS')});
      req = req.clone({headers: req.headers.set('Access-Control-Allow-Headers', 'X-Requested-With, Content-Type')});
      req = req.clone({headers: req.headers.set('Access-Control-Allow-Origin', 'http://localhost:4200')});
      req = req.clone({headers: req.headers.set('Content-Type', 'application/json')});

      console.log(req.headers);
    }
    return next.handle(req);
  }
}
