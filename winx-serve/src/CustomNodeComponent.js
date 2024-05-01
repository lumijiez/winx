import React from 'react';
import {Handle} from "reactflow";

const CustomNodeComponent = ({data}) => {
    return (
        <div className="flex">


            {data.inputTypes && (<div className="content-start bg-amber-400 flex-1 h-1/2 p-1 rounded-l">
                    <div>
                        <div className="flex">
                            <img className="content-center mr-2" alt="inputCog" src="/input.png"
                                 style={{width: 20 + 'px', height: 20 + 'px'}}/>
                            <strong className="content-center">Input: </strong>
                        </div>

                        {data.inputTypes.map((input, idx) => (
                            <div className="text-gray-700" key={idx}>{input.type} {input.identifier}</div>))}
                    </div>
                </div>
            )}


            <div className="flex flex-col innerBody rounded-bl-lg rounded-tr-lg divide-y sans-font"
                 style={{
                     backgroundColor: data.importance === 'critical' ? '#F59975' : '#01C6C9',
                 }}>


                <div>
                    <div className="access rounded-tr-lg m-0 text-center" style={{
                        backgroundColor: data.access_modifier === "public" ? "#00aa88" : data.access_modifier === "private" ? "red" : "#FF8C00"
                    }}>
                        {data.access_modifier && (<div
                                className="p-1 text-xl font-bold text-white">{data.access_modifier.toUpperCase()}</div>)}
                    </div>
                </div>


                <div className="p-3 m-0">
                    <Handle type="target" position="top" style={{borderRadius: 0}}/>


                    <div className="header">
                        <div className="flex justify-between" style={{fontWeight: 'bold', marginBottom: '5px'}}>
                            <div className="content-center text-2xl">
                                {data.label}
                            </div>
                        </div>
                    </div>


                    <div className="general">
                        <div className="flex">
                            <div className="content-center mr-2">
                                <img src="/cog.png" alt="cog" style={{width: 20 + 'px', height: 20 + 'px'}}/>
                            </div>
                            <span className="content-center">
                                {data.implemented_interface || 'None'}
                            </span>
                        </div>
                    </div>


                    {data.requirements && (<div>
                            <strong>Requirements:</strong>
                            {data.requirements.map((requirement, idx) => (<div className="text-gray-700" key={idx}>
                                    <span className="text-xl font-bold">
                                        {requirement.name}
                                    </span>

                                    {requirement.annotations && requirement.annotations.map((annotation, index) => (
                                        <div key={index}>
                                            <span className="fade-in-out font-mono text-red-700">
                                                {annotation.importance === "critical" ? "!" : ""}
                                            </span>

                                            <span style={{
                                                color: annotation.importance === "critical" ? "red" : "green"
                                            }}>
                                                {annotation.importance.toUpperCase()} {annotation.name}
                                            </span>
                                        </div>))}
                                </div>))}
                        </div>)}


                    <div className="specs">
                        {data.specificationEntries && (<div>
                                <strong>Specifications:</strong>
                                {data.specificationEntries.map((entry, idx) => (
                                    <div key={idx}>{entry.key}: {entry.value}</div>))}
                            </div>)}
                    </div>


                    <Handle type="source" position="bottom" style={{borderRadius: 0}}/>
                </div>
            </div>


            {data.returnTypes && (<div className="flex flex-col m-0 justify-between">
                    <div>
                        <div className="outerBody">
                            <span className="fade-in-out font-mono text-7xl text-red-700">
                                {data.importance === "critical" ? "!" : ""}
                            </span>
                        </div>
                    </div>

                    <div className="bg-amber-400 p-1 rounded-r">
                        <div className="flex">
                            <img className="content-center mr-1" alt="outputCog" src="/output.png"
                                 style={{width: 20 + 'px', height: 20 + 'px'}}/>
                            <strong className="content-center">Output: </strong>
                        </div>

                        {data.returnTypes.map((ret, idx) => (
                            <div className="text-gray-700 m-1" key={idx}>{ret.type} {ret.identifier}</div>))}
                    </div>
                </div>
            )}


        </div>);
};

export default CustomNodeComponent;
