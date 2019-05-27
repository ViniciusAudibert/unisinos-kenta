import React, { Component } from 'react'
import { Container, Row, Col, Label, Form, FormGroup, Input, Button } from 'reactstrap'
import './style.scss'
import { Cards } from '../cards';

const CARDS = [
    {
        title: 'Biblioteca',
        link: '/wiki',
        icon: 'fa-book',
        permission: 'SUPPORT',
    },
    {
        title: 'Visualizar Gravações',
        link: '/gravacoes',
        icon: 'fa-microphone',
        permission: 'SUPPORT',
    },
    {
        title: 'Controlar Chamados',
        link: '/chamados',
        icon: 'fa-users-cog',
        permission: 'SUPPORT',
    },
    {
        title: 'Controle de Tarefas',
        link: '/tarefas',
        icon: 'fa-clipboard-list',
        permission: 'SUPPORT',
    },
    {
        title: 'Help Desk',
        link: '/help-desk',
        icon: 'fa-headset',
        permission: 'SUPPORT',
    },
    {
        title: 'Visualizar Registros',
        link: '/registros',
        icon: 'fa-folder-open',
        permission: 'SUPPORT',
    },
    {
        title: 'Adicionar Chamado',
        link: '/adicionar-chamado',
        icon: 'fa-clipboard-list',
        permission: 'CLIENT,ADMIN',
    },
    {
        title: 'Adicionar Gravação',
        link: '/adicionar-gravacao',
        icon: 'fa-microphone',
        permission: 'CLIENT,ADMIN',
    },
    {
        title: 'E-mail para Kenta',
        link: '/adicionar-gravacao',
        icon: 'fa-envelope',
        permission: 'CLIENT',
    },
    {
        title: 'Excluir Chamado',
        link: '/excluir-chamado',
        icon: 'fa-calendar-times',
        permission: 'ADMIN',
    },
    {
        title: 'Excluir Gravação',
        link: '/excluir-gravacao',
        icon: 'fa-calendar-times',
        permission: 'ADMIN',
    },
    {
        title: 'Visualizar Registros',
        link: '/registros-historico',
        icon: 'fa-folder-open',
        permission: 'ADMIN',
    },
    {
        title: 'Visualizar Gravações',
        link: '/gravacoes-historico',
        icon: 'fa-microphone',
        permission: 'ADMIN',
    },
    {
        title: 'Criar Usuário',
        link: '/criar-usuario',
        icon: 'fa-user-plus',
        permission: 'ADMIN',
    },
]

export class Home extends Component {
    state = {
        cardItems: this._getCards(),
    }

    _getCards(permission = 'ADMIN') {
        return CARDS
            .filter(item => item.permission
                .split(',')
                .some(p => permission === p || p === 'ALL'))
    }

    render() {
        const { cardItems } = this.state

        return (
            <Container>
                <Row>
                    <Cards className="home-cards" items={cardItems} />
                </Row>
            </Container>
        )
    }
}
