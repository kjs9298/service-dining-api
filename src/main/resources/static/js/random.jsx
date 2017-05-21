"use strict";

var RandomMessage = React.createClass({
   
    getInitialState: function () {
        return {
            message : '삼겹살!'
        };
    },
    onClick: function () {
        var message = ['항정살!', '갈비!', '곱창', '대창!', '배고픔여~'];
        var randomMessage = message[Math.floor((Math.random() * message.length))];
        
        this.setState({
            message: randomMessage
        });
    },
    render: function () {
        return (
            <div>
                <MessageView message={this.state.message} />
                <p><input type="button" onClick={this.onClick} value="Change!" /> </p>
            </div>
        );
    }
});

var MessageView = React.createClass({
    render: function () {
        return (
            <p>아싸 ~ {this.props.message} </p>
        );
    }
});

ReactDOM.render(
        <RandomMessage />,
        document.getElementById('greeting-div')
);