import React, { Component } from 'react'
import { Container, Row, Col, Label, Form, FormGroup, Input, Button } from 'reactstrap'
import './style.scss'

export class AberturaChamados extends Component {
    state = {
        dataAbertura: '',
        dataAberturaFormatted: '',
    }

    async componentDidMount() {
        this._loadFormattedDate()
    }

    _loadFormattedDate() {
        const now = new Date()
        let formattedDate = null

        const day = now.getDate()
        const month = now.getMonth()
        const year = now.getFullYear()

        formattedDate = `${day < 10 ? 0 : ''}${day}/${month < 10 ? 0 : ''}${month}/${year}`

        this.setState(() => ({
            dataAbertura: now.toISOString(),
            dataAberturaFormatted: formattedDate,
        }))
    }

    render() {
        const { dataAberturaFormatted } = this.state

        return (
            <Container>
                <h1>Abertura de chamados</h1>
                <Form>

                    <Row form>
                        <Col md={6}>
                            <FormGroup>
                                <Label for="data-abertura">Data de abertura</Label>
                                <Input type="text" name="data-abertura" id="data-abertura" placeholder="Data abertura" disabled={true} value={dataAberturaFormatted} />
                            </FormGroup>
                        </Col>
                        <Col md={6}>
                            <FormGroup>
                                <Label for="aberto-por">Aberto por</Label>
                                <Input type="text" name="aberto-por" id="aberto-por" placeholder="Aberto por" disabled={true} value="Vinicius Audibert" />
                            </FormGroup>
                        </Col>
                    </Row>

                    <Row form>
                        <Col md={6}>
                            <FormGroup>
                                <Label for="categoria">Categoria</Label>
                                <Input type="select" name="categoria" id="categoria" placeholder="Selecione a categoria">
                                    <option>Produto</option>
                                    <option>Teste</option>
                                </Input>
                            </FormGroup>
                        </Col>
                        <Col md={6}>
                            <FormGroup>
                                <Label for="aberto-por">Aberto por</Label>
                                <Input type="text" name="aberto-por" id="aberto-por" placeholder="Data abertura" disabled={true} value="Vinicius Audibert" />
                            </FormGroup>
                        </Col>
                    </Row>

                    <Row form>
                        <Col>
                            <FormGroup>
                                <Label for="descricao-chamado">Descrição do chamado</Label>
                                <Input style={{ minHeight: '150px' }} type="textarea" name="descricao-chamado" id="descricao-chamado" placeholder="Digite a descrição do chamado" />
                            </FormGroup>
                        </Col>
                    </Row>

                    <Row form>
                        <Col>
                            <FormGroup>
                                <Button size="md">Abrir Chamado</Button>
                            </FormGroup>
                        </Col>
                    </Row>

                </Form>
            </Container>
        )
    }
}
