import React, { Component } from 'react'
import { Link } from 'react-router-dom'
import './style.scss'

export class Cliente extends Component {
  async componentDidMount() {
    // const response = await fetch('/api/groups')
    // const body = await response.json()
    // this.setState({ groups: body, isLoading: false })
  }

  render() {
    return (
      <main>
        Teste Cliente
      </main>
    )
  }
}
