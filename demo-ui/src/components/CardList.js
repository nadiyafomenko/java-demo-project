import React from 'react'

import Card from './Card'

export default class CardList extends React.Component {
    constructor() {
        super();
        this.state = {
            error: null,
            isLoaded: false,
            items: []
        };
    }

    componentDidMount() {
        fetch("http://localhost:8080/cards")
            .then(res => res.json())
            .then(
                (result) => {
                    console.log(result);
                    this.setState({
                        isLoaded: true,
                        items: result
                    });
                },
                (error) => {
                    this.setState({
                        isLoaded: true,
                        error: error
                    });
                }
            )
    }

    render() {
        return (
            <div className="card-list-container">
                <div className="table-card-list">
                    <div>Doctor</div>
                    <div>Procedure</div>
                    <div>Date</div>
                </div>
                {this.state.items.map(item =>
                    <Card key={item.id} procedureName={item.procedureName} doctor={item.doctor}/>
                )}
            </div>
        )
    }
}

