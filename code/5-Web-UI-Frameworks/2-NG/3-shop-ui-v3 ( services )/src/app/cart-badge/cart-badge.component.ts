import { Component, Input, OnInit } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-cart-badge',
  templateUrl: './cart-badge.component.html',
  styleUrls: ['./cart-badge.component.scss']
})
export class CartBadgeComponent {

  count = 0;

  constructor(private cartService: CartService) { }

  ngDoCheck() {
    this.count = this.cartService.cartCount;
  }

}
