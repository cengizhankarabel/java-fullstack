import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.scss']
})
export class ProductComponent {

  @Input("value") product: any;

  currentTab: number = 1;

  @Output() buy = new EventEmitter()

  handleTabChange(e: Event, tabIndex: number) {
    e.preventDefault();
    // console.log("handling tab change..");
    // console.log(e);
    // console.log(tabIndex);
    this.currentTab = tabIndex;
  }
  handleBuy(event: Event) {
    this.buy.emit(this.product)
  }

}
