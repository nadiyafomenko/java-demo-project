import React from 'react'

import Card from './Card'
import CardInfoModal from './CardInfoModal'

export default class CardList extends React.Component {
    constructor() {
        super();
        this.state = {
            error: null,
            isLoaded: false,
            items: [],
            isModalVisible: false
        };
        this.handleModalVisibility = this.handleModalVisibility.bind(this) 
    }

    handleModalVisibility(){
        console.log("...")
        this.setState = {
            isModalVisible: this.state.isModalVisible ? false : true
        }
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
                    <span>Doctor</span>
                    <span>Procedure</span>
                    <span>Date</span>
                </div>
                {this.state.items.map(item => 
                        <Card key={item.id} procedureName={item.procedureName} doctor={item.doctor} onClick = {this.handleModalVisibility}/>
                )} 
                <CardInfoModal items = {this.state.items} handleModalVisibility = {this.handleModalVisibility} isModalVisible = {this.state.isModalVisible}/>
            </div>
        )
    }
}

