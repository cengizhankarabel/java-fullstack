import { Component, EventEmitter, Input, Output } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.scss']
})
export class ProductComponent {

  @Input("value") product: any;

  currentTab: number = 1;

  constructor(
    private cartService: CartService
  ) { }

  handleTabChange(e: Event, tabIndex: number) {
    e.preventDefault();
    // console.log("handling tab change..");
    // console.log(e);
    // console.log(tabIndex);
    this.currentTab = tabIndex;
  }
  handleBuy(event: Event) {
    //this.buy.emit(this.product)
    this.cartService.addToCart(this.product)
  }

}
