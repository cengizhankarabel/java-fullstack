import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ProductListComponent } from './product-list/product-list.component';
import { ProductComponent } from './product/product.component';
import { CartViewComponent } from './cart-view/cart-view.component';
import { CartBadgeComponent } from './cart-badge/cart-badge.component';
import { DiscountPipe } from './discount.pipe';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ProductListComponent,
    ProductComponent,
    CartViewComponent,
    CartBadgeComponent,
    DiscountPipe
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
