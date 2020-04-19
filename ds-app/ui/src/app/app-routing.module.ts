import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {LoginComponent} from './login/login.component';
import {LogoutComponent} from './logout/logout.component';
import {AuthGaurdService} from './service/auth-gaurd.service';
import {PortfolioComponent} from './portfolio/portfolio.component';
import {HomeComponent} from './home/home.component';
import {SupportChatComponent} from "./support-chat/support-chat.component";

const routes: Routes = [
  {path: 'portfolio', component: PortfolioComponent, canActivate: [AuthGaurdService]},
  {path: 'support', component: SupportChatComponent, canActivate: [AuthGaurdService]},
  {path: 'login', component: LoginComponent},
  {path: 'logout', component: LogoutComponent, canActivate: [AuthGaurdService]},
  {path: '', component: HomeComponent, canActivate: [AuthGaurdService]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
