import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CartService {

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
    console.log(this.cart);
  }

  constructor() { }

}
