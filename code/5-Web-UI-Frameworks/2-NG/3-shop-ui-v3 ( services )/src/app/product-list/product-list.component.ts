import { Component, Output, EventEmitter } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.scss']
})
export class ProductListComponent {

  products: Array<any> = []

  constructor(
    private productService: ProductService
  ) { }

  ngOnInit() {
    this.products = this.productService.getProducts();
  }

}
