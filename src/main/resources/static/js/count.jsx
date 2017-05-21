"use strict";

var Counter = React.createClass({
    render: function () {
        return (
           <div>
                <span>Conter: {this.props.count} </span>
                <br/>
                <input type="text" value={this.props.count} />
            </div>
        );
    }
});

var mainElement = document.querySelector("main"),
    count = 1;

ReactDOM.render(<Counter count="1"></Counter>, mainElement);
