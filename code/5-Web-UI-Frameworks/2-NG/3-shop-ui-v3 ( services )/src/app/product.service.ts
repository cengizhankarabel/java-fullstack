import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private products = [
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

  constructor() { }

  getProducts() {
    return this.products;
  }

}
