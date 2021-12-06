import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.scss']
})
export class ProductListComponent {

  products = [
    {
      id: 1,
      name: 'Laptop',
      price: 149000,
      description: 'New Pro',
      isAvailable: true,
      imagePath: 'assets/Laptop.png',
      makeDate: Date.now(),
      discountPrice: 10000
    },
    {
      id: 2,
      name: 'Mobile',
      price: 14000,
      description: 'New Model',
      isAvailable: true,
      imagePath: 'assets/Mobile.png',
      makeDate: Date.now()
    },
  ]

  @Output()
  buy = new EventEmitter();

  addToCart(event: any) {
    this.buy.emit(event)
  }

}
