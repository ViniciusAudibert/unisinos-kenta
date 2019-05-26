import './App.scss'

import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import { Home } from './components/home'
import { Suporte } from './components/suporte'
import { Cliente } from './components/cliente'
import { Administracao } from './components/administracao'
import { Cadastro } from './components/cadastro'
import { SideMenu } from './components/side-menu'

class App extends Component {
  render() {
    return (
      <>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossOrigin="anonymous" />

        <Router>
          <article className="page-content">

            <SideMenu />

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
