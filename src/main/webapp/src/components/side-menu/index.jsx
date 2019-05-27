import React, { Component } from 'react'
import PropTypes from 'prop-types'
import { Link, NavLink } from 'react-router-dom'
import './style.scss'

export class SideMenu extends Component {
  static propTypes = {
    items: PropTypes.arrayOf(PropTypes.shape({
      icon: PropTypes.string,
      link: PropTypes.string,
      label: PropTypes.string,
    }))
  }

  render() {
    return (
      <aside className="side-menu">
        <nav>
          <ul className="side-menu-list">
            <li className="side-menu-item"><Link className="link" to="/">Kenta</Link></li>

            {this.props.items.map((option, index) => {
              const { icon, label, link } = option
              return (
                <li key={`side-menu-item-${index}`} className="side-menu-item">
                  <NavLink activeClassName="-active" exact={true} className="link" to={link}>
                    <i className={`icon fas ${icon}`} />
                    {label}
                  </NavLink>
                </li>
              )
            })}
          </ul>
        </nav>
      </aside>
    )
  }
}
