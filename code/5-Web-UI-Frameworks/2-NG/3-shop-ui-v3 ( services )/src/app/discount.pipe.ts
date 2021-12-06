import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'discount'
})
export class DiscountPipe implements PipeTransform {

  transform(value: number, dp: number): unknown {
    if (dp)
      return value - dp;
    else
      return value - 1;
  }

}
