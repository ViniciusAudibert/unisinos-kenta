import './App.scss'

import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import { Home } from './components/home'
import { Suporte } from './components/suporte'
import { Cliente } from './components/cliente'
import { Administracao } from './components/administracao'
import { Cadastro } from './components/cadastro'
import { SideMenu } from './components/side-menu'

const MENU = [
  {
    label: 'Início',
    link: '/',
    icon: 'fa-home',
    permission: 'ALL',
  },
  {
    label: 'Administração',
    link: '/administração',
    icon: 'fa-user-tie',
    permission: 'ADMIN',
  },
  {
    label: 'Suporte',
    link: '/suporte',
    icon: 'fa-users-cog',
    permission: 'SUPPORT',
  },
  {
    label: 'Cliente',
    link: '/cliente',
    icon: 'fa-users',
    permission: 'CLIENT',
  },
  {
    label: 'Cadastro',
    link: '/cadastro',
    icon: 'fa-user-plus',
    permission: 'SUPPORT,ADMIN',
  },
  {
    label: 'Sair',
    link: '/logout',
    icon: 'fa-power-off',
    permission: 'ALL',
  },
]

class App extends Component {
  state = {
    itemsMenu: this._getItemsMenu(),
  }

  constructor(props) {
    super(props)
    this._loadUser()
  }

  _getItemsMenu(permission) {
    return MENU
      .filter(item => item.permission
        .split(',')
        .some(p => permission === p || p === 'ALL'))
  }

  async _loadUser() {
    // TODO: Load User and Reset `_getItemsMenu`
  }

  render() {
    const { itemsMenu } = this.state
    return (
      <>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossOrigin="anonymous" />

        <Router>
          <article className="page-content">

            <SideMenu items={itemsMenu} />

            <section className="main">
              <Route exact path="/" component={Home} />
              <Route path="/cliente" component={Cliente} />
              <Route path="/administração" component={Administracao} />
              <Route path="/suporte" component={Suporte} />
              <Route path="/cadastro" component={Cadastro} />
            </section>
          </article>
        </Router>
      </>
    )
  }
}

export default App
