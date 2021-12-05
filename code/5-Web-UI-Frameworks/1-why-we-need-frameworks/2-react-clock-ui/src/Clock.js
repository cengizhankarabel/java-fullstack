import React, { useEffect, useState } from "react";

function Clock(props) {
    let { timeZone } = props
    let [time, setTime]  = useState();
    useEffect(() => {
        setInterval(() => {
            let t = new Date().toLocaleTimeString('en-US', { timeZone })
            setTime(t)
        }, 1000)
    }, [])
    return (
        <div className="card">
            <div className="card-header">{timeZone}</div>
            <div className="card-body">
                <span className="badge bg-danger">
                    {time}
                </span>
            </div>
        </div>
    )
}

export { Clock };