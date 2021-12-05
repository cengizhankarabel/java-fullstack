//--------------------------------
// Plain-JS component
//--------------------------------

function Clock(props) {
    let timeZone = props.timeZone;
    return (
        `
            <div class="card">
                <div class="card-header">${timeZone}</div>
                <div class="card-body">
                    <span class="badge bg-danger">
                        ${new Date().toLocaleTimeString('en-US', { timeZone })}
                    </span>
                </div>
            </div>
        `
    );
}

//--------------------------------
// using DOM API
//--------------------------------

const clock1Ele = document.getElementById('clock1')
const clock2Ele = document.getElementById('clock2')
const clock3Ele = document.getElementById('clock3')


setInterval(() => {

    clock1Ele.innerHTML = Clock({ timeZone: 'America/New_york' })
    clock2Ele.innerHTML = Clock({ timeZone: 'Asia/Kolkata' })
    clock3Ele.innerHTML = Clock({ timeZone: 'Asia/Dubai' })

}, 1000)