import React, { Component } from 'react'
import PropTypes from 'prop-types'
import { Link } from 'react-router-dom'
import './style.scss'

export class Cards extends Component {
  static propTypes = {
    className: PropTypes.string,
    items: PropTypes.arrayOf(PropTypes.shape({
      title: PropTypes.string,
      icon: PropTypes.string,
      link: PropTypes.string,
    })).isRequired,
  }

  render() {
    const { items, className } = this.props

    return (
      <ul className={`cards ${className || ''}`}>
        {items.map(item => {
          const { title, icon, link } = item

          return (
            <li className="item">
              <Link className="link" to={link}>
                <i className={`icon fas ${icon}`} />
                {title}
              </Link>
            </li>
          )
        })}
      </ul>
    )
  }
}
