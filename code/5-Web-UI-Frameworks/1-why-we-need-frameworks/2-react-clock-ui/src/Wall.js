import React from 'react';
import { Clock } from './Clock';


function Wall() {
    return (
        <div className="container">
    
          <div className="row">
            <div className="col-4">
            <Clock timeZone="America/New_york"/>
            </div>
            <div className="col-4">
            <Clock timeZone="Asia/Kolkata"/>
            </div>
            <div className="col-4">
            <Clock timeZone="Asia/Dubai"/>
            </div>
          </div>
          
        </div>
      );
}

export { Wall }