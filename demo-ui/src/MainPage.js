import React from 'react'
import {BrowserRouter as Router, Route, Switch} from "react-router-dom";

import CardList from './components/CardList'
import AddCardModal from './components/AddCardModal'

class MainPage extends React.Component {
    constructor(){
        super()
        this.state = {
            isModalvisible: false
        }

        this.handleModalVisibility = this.handleModalVisibility.bind(this) 
    }

    handleModalVisibility(bool){
        this.setState({isModalvisible: bool});     
        console.log(this.state.isModalvisible)  
    }

    render() {
        return (
            <Router>
                <Switch>
                    <Route path="/cards">
                        <div className="container">
                            <div className="header">
                                <h2>Medhost</h2>
                                <button className="btn add-card-btn" onClick = {this.handleModalVisibility}>Add Card</button>
                            </div>
                            <CardList/>
                            <AddCardModal isModalvisible = {this.state.isModalvisible} handleModalVisibility = {this.handleModalVisibility}/>
                        </div>
                    </Route>
                    <Route>

                    </Route>
                </Switch>
            </Router>
        )
    }
}

export default MainPage;
