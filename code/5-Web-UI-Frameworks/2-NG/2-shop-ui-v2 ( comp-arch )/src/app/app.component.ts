import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  title = 'shop-ui-v1';
  isCartOpen: boolean = false

  cart: any = {} // Map
  cartCount = Object.keys(this.cart).length

  addToCart(item: any) {
    let { id } = item;
    let cartLine = this.cart[id]
    if (cartLine) {
      cartLine = { ...cartLine, qty: cartLine.qty + 1 }
    } else {
      cartLine = { item, qty: 1 }
    }
    this.cart[id] = cartLine;
    this.cartCount = Object.keys(this.cart).length
  }

  toggleCart(event: Event) {
    event.preventDefault();
    this.isCartOpen = !this.isCartOpen
  }


}
