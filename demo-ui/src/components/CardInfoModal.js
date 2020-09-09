import React from 'react'
import { Button,Modal } from 'react-bootstrap';

export default class CardInfoModal extends React.Component {
    constructor(props){
        super()
        this.state = {
            isModalVisible: props.isModalVisible
        }
    }
    render(){
        return(
            <Modal show={this.state.isModalVisible} onHide={this.props.handleModalVisibility}>
            <Modal.Header closeButton>
                <Modal.Title>Modal heading</Modal.Title>
            </Modal.Header>
            <Modal.Body>Woohoo, you're reading this text in a modal!</Modal.Body>
            <Modal.Footer>
                <Button variant="secondary" onClick={this.props.handleModalVisibility}>
                        Close
                </Button>
                <Button variant="primary" onClick={this.props.handleModalVisibility}>
                    Save Changes
                </Button>
            </Modal.Footer>
        </Modal>
        )
    }
}