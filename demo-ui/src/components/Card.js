import React from 'react';

export default function Card(props) {
    return (
        <div className="card">
            <div className = "card-doctor">{props.doctor}</div>
            <div className = "card-procedureName">{props.procedureName}</div>   
        </div>
    )
}