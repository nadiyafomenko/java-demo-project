import React from 'react'
import {BrowserRouter as Router, Route, Switch} from "react-router-dom";

import CardList from './components/CardList'

class MainPage extends React.Component {
    render() {
        return (
            <Router>
                <Switch>
                    <Route path="/cards">
                        <div className="container">
                            <div className="header">
                                <h2>Medhost</h2>
                                <button className="btn add-card-btn">Add Card</button>
                            </div>
                            <CardList/>
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
