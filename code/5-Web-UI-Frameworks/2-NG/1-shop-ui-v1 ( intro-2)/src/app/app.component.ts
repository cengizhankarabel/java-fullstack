import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'shop-ui-v1';
  products=[
    {
      id:1,
      name:'Laptop',
      price:149000,
      description:'New Pro',
      isAvailable: true,
      imagePath:'assets/Laptop.png'
    },
    {
      id:2,
      name:'Mobile',
      price:1900,
      description:'New Model',
      isAvailable: true,
      imagePath:'assets/Mobile.png'
    }
  ]

  currentTab: number = 1;

  handleTabChange(e:Event, tabIndex:number){
    // console.log("handling tab change..");
    // console.log(e)
    // console.log(tabIndex);
    this.currentTab = tabIndex;
    
  }


}
