
import React from 'react';

// clock-ui componenet

function Clock(props) {
    // let {timeZone} = props.timeZone;
    // -or-
    let { timeZone } = props;
    return(
        <div className="card">
            <div className="card-header">{timeZone}</div>
            <div className="card-body">
                <span className="badge bg-danger"> 
                {new Date().toLocaleTimeString('en-US', { timeZone })}
                </span>
            </div>
        </div>    
    )
}

export { Clock }