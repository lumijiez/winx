import React, { useEffect } from 'react';
import ReactFlow, { Controls, Background, useNodesState, useEdgesState } from 'react-flow-renderer';
import CustomNodeComponent from './CustomNodeComponent';
import {ReactFlowProvider} from "reactflow";
import {jsonData} from './Data.js';

const nodeTypes = {
    customNode: CustomNodeComponent,
};

function CustomGraph() {
    const [nodes, setNodes, onNodesChange] = useNodesState([]);
    const [edges, setEdges, onEdgesChange] = useEdgesState([]);

    useEffect(() => {
        const loadedNodes = [];
        const loadedEdges = [];
        let yOffset = 100;

        jsonData.forEach((pkg, index) => {
            const pkgId = `pkg-${pkg.name}`;
            loadedNodes.push({
                id: pkgId,
                type: 'customNode',
                position: { x: 100, y: yOffset * index },
                data: { label: `Package: ${pkg.name}`, ...pkg }
            });

            pkg.interfaces.forEach((iface, iIndex) => {
                const ifaceId = `iface-${iface.name}`;
                loadedNodes.push({
                    id: ifaceId,
                    type: 'customNode',
                    position: { x: 300, y: yOffset * (index + 1 + iIndex) },
                    data: { label: `Interface: ${iface.name}`, ...iface }
                });
                loadedEdges.push({
                    id: `e-${pkgId}-${ifaceId}`,
                    source: pkgId,
                    target: ifaceId,
                    type: 'simplebezier',
                    animated: true,
                });

                iface.functions.forEach((func, fIndex) => {
                    const funcId = `func-${iface.name}-${func.name}`;
                    loadedNodes.push({
                        id: funcId,
                        type: 'customNode',
                        position: { x: 500, y: yOffset * (index + 2 + iIndex + fIndex) },
                        data: { label: `${func.name}()`, ...func }
                    });
                    loadedEdges.push({
                        id: `e-${ifaceId}-${funcId}`,
                        source: ifaceId,
                        target: funcId,
                        type: 'simplebezier',
                        animated: true
                    });
                });
            });

            pkg.specifications.forEach((spec, sIndex) => {
                const specId = `spec-${spec.name}`;
                loadedNodes.push({
                    id: specId,
                    type: 'customNode',
                    position: { x: 300, y: yOffset * (index + 1 + sIndex) },
                    data: { label: `Specification: ${spec.name}`, ...spec }
                });

                if (spec.implemented_interface) {
                    const interfaceId = `iface-${spec.implemented_interface}`;
                    loadedEdges.push({
                        id: `e-${interfaceId}-${specId}`,
                        source: interfaceId,
                        target: specId,
                        type: 'simplebezier',
                        animated: true
                    });
                }

                loadedEdges.push({
                    id: `e-${pkgId}-${specId}`,
                    source: pkgId,
                    target: specId,
                    type: 'simplebezier',
                    animated: true,
                    style: { stroke: '#000', strokeWidth: 4 }
                });

                spec.functions.forEach((func, fIndex) => {
                    const funcId = `func-${spec.name}-${func.name}`;
                    loadedNodes.push({
                        id: funcId,
                        type: 'customNode',
                        position: { x: 500, y: yOffset * (index + 2 + sIndex + fIndex) },
                        data: { label: `${func.name}()`, ...func },
                    });

                    if (func.implemented_interface) {
                        const interfaceId = `iface-${func.implemented_interface}`;
                        loadedEdges.push({
                            id: `e-${interfaceId}-${funcId}`,
                            source: interfaceId,
                            target: funcId,
                            type: 'simplebezier',
                            animated: true
                        });
                    }

                    loadedEdges.push({
                        id: `e-${specId}-${funcId}`,
                        source: specId,
                        target: funcId,
                        type: 'simplebezier',
                        animated: true,
                        style: { stroke: '#000', strokeWidth: 4 }
                    });
                });
            });
        });

        console.log(loadedEdges)

        setNodes(loadedNodes);
        setEdges(loadedEdges);
    }, [setNodes, setEdges]);

    return (
        <div style={{ height: 100+'vh', width: 100 + '%' }}>
            <ReactFlowProvider>
                <ReactFlow
                    nodes={nodes}
                    edges={edges}
                    onNodesChange={onNodesChange}
                    onEdgesChange={onEdgesChange}
                    nodeTypes={nodeTypes}
                    fitView>

                    <Controls />
                    <Background />
                </ReactFlow>
            </ReactFlowProvider>
        </div>
    );
}

export default CustomGraph;
