import React, { Component } from 'react'
import { Link } from 'react-router-dom'
import './style.scss'

const MENU = [
  {
    label: 'Início',
    link: '/',
    icon: 'fa-home',
  },
  {
    label: 'Administração',
    link: '/administração',
    icon: 'fa-user-tie',
  },
  {
    label: 'Suporte',
    link: '/suporte',
    icon: 'fa-users-cog',
  },
  {
    label: 'Cliente',
    link: '/cliente',
    icon: 'fa-users',
  },
  {
    label: 'Cadastro',
    link: '/cadastro',
    icon: 'fa-user-plus',
  },
  {
    label: 'Sair',
    link: '/',
    icon: 'fa-power-off',
  },
]

export class SideMenu extends Component {
  render() {
    return (
      <aside className="side-menu">
        <nav>
          <ul className="side-menu-list">
            <li className="side-menu-item"><Link className="link" to="/">Kenta</Link></li>

            {MENU.map((option, index) => {
              const { icon, label, link } = option
              return (
                <li key={`side-menu-item-${index}`} className="side-menu-item"><Link className="link" to={link}><i className={`icon fas ${icon}`} />{label}</Link></li>
              )
            })}
          </ul>
        </nav>
      </aside>
    )
  }
}
