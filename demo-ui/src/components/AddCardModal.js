import React from 'react'
import { Button,Modal } from 'react-bootstrap';

export default class AddCardModal extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            isModalvisible: this.props.isModalvisible
        }
        this.handleModalVisibilityTrue = this.handleModalVisibilityTrue.bind(this)
    }


    handleModalVisibility(){
        this.props.handleModalVisibility(false)
    }

 render(){
    return(
        <Modal show={this.isModalvisible} onHide={this.handleModalVisibilityTrue}>
        <Modal.Header closeButton>
            <Modal.Title>Modal heading</Modal.Title>
        </Modal.Header>
        <Modal.Body>Woohoo, you're reading this text in a modal!</Modal.Body>
        <Modal.Footer>
            <Button variant="secondary" onClick={this.handleModalVisibilityTrue}>
                    Close
            </Button>
            <Button variant="primary" onClick={this.handleModalVisibilityTrue}>
                Save Changes
            </Button>
        </Modal.Footer>
    </Modal>
    )
 }

    
}