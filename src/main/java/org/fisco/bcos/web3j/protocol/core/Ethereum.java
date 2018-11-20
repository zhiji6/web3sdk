package org.fisco.bcos.web3j.protocol.core;

import java.math.BigInteger;
import java.util.List;

import org.fisco.bcos.web3j.protocol.core.methods.request.ShhFilter;
import org.fisco.bcos.web3j.protocol.core.methods.response.DbGetHex;
import org.fisco.bcos.web3j.protocol.core.methods.response.DbGetString;
import org.fisco.bcos.web3j.protocol.core.methods.response.DbPutHex;
import org.fisco.bcos.web3j.protocol.core.methods.response.DbPutString;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthAccounts;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthBlock;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthBlockNumber;

//增加eth_pbftView接口
import org.fisco.bcos.web3j.protocol.core.methods.response.EthPbftView;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthCoinbase;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthCompileLLL;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthCompileSerpent;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthCompileSolidity;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthEstimateGas;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthFilter;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthGasPrice;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthGetBalance;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthGetBlockTransactionCountByHash;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthGetBlockTransactionCountByNumber;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthGetCode;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthGetCompilers;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthGetStorageAt;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthGetTransactionCount;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthGetTransactionReceipt;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthGetUncleCountByBlockHash;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthGetUncleCountByBlockNumber;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthGetWork;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthHashrate;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthLog;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthMining;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthProtocolVersion;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthSign;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthSubmitHashrate;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthSubmitWork;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthSyncing;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthTransaction;
import org.fisco.bcos.web3j.protocol.core.methods.response.EthUninstallFilter;
import org.fisco.bcos.web3j.protocol.core.methods.response.NetListening;
import org.fisco.bcos.web3j.protocol.core.methods.response.NetPeerCount;
import org.fisco.bcos.web3j.protocol.core.methods.response.NetVersion;
import org.fisco.bcos.web3j.protocol.core.methods.response.ShhAddToGroup;
import org.fisco.bcos.web3j.protocol.core.methods.response.ShhHasIdentity;
import org.fisco.bcos.web3j.protocol.core.methods.response.ShhMessages;
import org.fisco.bcos.web3j.protocol.core.methods.response.ShhNewFilter;
import org.fisco.bcos.web3j.protocol.core.methods.response.ShhNewGroup;
import org.fisco.bcos.web3j.protocol.core.methods.response.ShhNewIdentity;
import org.fisco.bcos.web3j.protocol.core.methods.response.ShhUninstallFilter;
import org.fisco.bcos.web3j.protocol.core.methods.response.ShhVersion;
import org.fisco.bcos.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.fisco.bcos.web3j.protocol.core.methods.response.Web3Sha3;
import org.fisco.bcos.web3j.protocol.core.methods.request.ProofMerkle;
import org.fisco.bcos.web3j.protocol.core.methods.response.*;

/**
 * Core Ethereum JSON-RPC API.
 */
public interface Ethereum {
    Request<?, Web3ClientVersion> web3ClientVersion();

    Request<?, Web3Sha3> web3Sha3(String data);

    Request<?, NetVersion> netVersion();

    Request<?, NetListening> netListening();

    Request<?, NetPeerCount> netPeerCount();

    Request<?, EthProtocolVersion> ethProtocolVersion();

    Request<?, EthCoinbase> ethCoinbase();

    Request<?, EthSyncing> ethSyncing();

    Request<?, EthMining> ethMining();

    Request<?, EthHashrate> ethHashrate();

    Request<?, EthGasPrice> ethGasPrice();

    Request<?, EthAccounts> ethAccounts();

    Request<?, EthBlockNumber> ethBlockNumber();
    
    //增加eth_pbftView接口
    Request<?, EthPbftView> ethPbftView();

    //增加consensusStatus接口
    Request<?,NetVersion> consensusStatus();

    //增加groupList接口
    Request<?, GroupList> ethGroupList();

    //增加peerList接口
    Request<?, EthPeerList> ethGroupPeers();

    //增加peers接口
   // Request<?, EthPeers> ethPeersInfo();

    Request<?, EthGetBalance> ethGetBalance(
            String address, DefaultBlockParameter defaultBlockParameter);

//    Request<?, EthGetBalance> ethGetBalanceCNS(
//            String contractName, DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetStorageAt> ethGetStorageAt(
            String address, BigInteger position,
            DefaultBlockParameter defaultBlockParameter);

//    Request<?, EthGetStorageAt> ethGetStorageAtCNS(
//            String contractName, BigInteger position,
//            DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetTransactionCount> ethGetTransactionCount(
            String address, DefaultBlockParameter defaultBlockParameter);

//    Request<?, EthGetTransactionCount> ethGetTransactionCountCNS(
//            String contractName, DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetBlockTransactionCountByHash> ethGetBlockTransactionCountByHash(
            String blockHash);

    Request<?, EthGetBlockTransactionCountByNumber> ethGetBlockTransactionCountByNumber(
            DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetUncleCountByBlockHash> ethGetUncleCountByBlockHash(String blockHash);

    Request<?, EthGetUncleCountByBlockNumber> ethGetUncleCountByBlockNumber(
            DefaultBlockParameter defaultBlockParameter);

    Request<?, EthGetCode> ethGetCode(String address, DefaultBlockParameter defaultBlockParameter);

  //  Request<?, EthGetCode> ethGetCodeCNS(String contractName, DefaultBlockParameter defaultBlockParameter);

    Request<?, EthSign> ethSign(String address, String sha3HashOfDataToSign);

    Request<?, EthSendTransaction> ethSendTransaction(
            org.fisco.bcos.web3j.protocol.core.methods.request.Transaction transaction);

//    Request<?, EthSendTransaction> ethSendTransactionCNS(
//            String contractName,
//            Transaction transaction);

    Request<?, EthSendTransaction> ethSendRawTransaction(
            String signedTransactionData);

    Request<?, EthCall> ethCall(
            org.fisco.bcos.web3j.protocol.core.methods.request.Transaction transaction,
            DefaultBlockParameter defaultBlockParameter);

//    Request<?, EthCall> ethCallCNS(
//            String contractName,
//            Transaction transaction,
//            DefaultBlockParameter defaultBlockParameter);

    Request<?, EthEstimateGas> ethEstimateGas(
            org.fisco.bcos.web3j.protocol.core.methods.request.Transaction transaction);

    Request<?, EthBlock> ethGetBlockByHash(String blockHash, boolean returnFullTransactionObjects);

    Request<?, EthBlock> ethGetBlockByNumber(
            DefaultBlockParameter defaultBlockParameter,
            boolean returnFullTransactionObjects);

    Request<?, EthTransaction> ethGetTransactionByHash(String transactionHash);

    Request<?, EthTransaction> ethGetTransactionByBlockHashAndIndex(
            String blockHash, BigInteger transactionIndex);

    Request<?, EthTransaction> ethGetTransactionByBlockNumberAndIndex(
            DefaultBlockParameter defaultBlockParameter, BigInteger transactionIndex);

    Request<?, EthGetTransactionReceipt> ethGetTransactionReceipt(String transactionHash);

    Request<?, EthBlock> ethGetUncleByBlockHashAndIndex(
            String blockHash, BigInteger transactionIndex);

    Request<?, EthBlock> ethGetUncleByBlockNumberAndIndex(
            DefaultBlockParameter defaultBlockParameter, BigInteger transactionIndex);

    Request<?, EthGetCompilers> ethGetCompilers();

    Request<?, EthCompileLLL> ethCompileLLL(String sourceCode);

    Request<?, EthCompileSolidity> ethCompileSolidity(String sourceCode);

    Request<?, EthCompileSerpent> ethCompileSerpent(String sourceCode);

    Request<?, EthFilter> ethNewFilter(org.fisco.bcos.web3j.protocol.core.methods.request.EthFilter ethFilter);

    Request<?, EthFilter> ethNewBlockFilter();

    Request<?, EthFilter> ethNewPendingTransactionFilter();

    Request<?,EthPendingTransactions> ethPendingTransaction();

    Request<?, EthUninstallFilter> ethUninstallFilter(BigInteger filterId);

    Request<?, EthLog> ethGetFilterChanges(BigInteger filterId);

    Request<?, EthLog> ethGetFilterLogs(BigInteger filterId);

    Request<?, EthLog> ethGetLogs(org.fisco.bcos.web3j.protocol.core.methods.request.EthFilter ethFilter);

    Request<?, EthGetWork> ethGetWork();

    Request<?, EthSubmitWork> ethSubmitWork(String nonce, String headerPowHash, String mixDigest);

    Request<?, EthSubmitHashrate> ethSubmitHashrate(String hashrate, String clientId);

    Request<?, DbPutString> dbPutString(String databaseName, String keyName, String stringToStore);

    Request<?, DbGetString> dbGetString(String databaseName, String keyName);

    Request<?, DbPutHex> dbPutHex(String databaseName, String keyName, String dataToStore);

    Request<?, DbGetHex> dbGetHex(String databaseName, String keyName);

    Request<?, ShhPost> shhPost(
            org.fisco.bcos.web3j.protocol.core.methods.request.ShhPost shhPost);

    Request<?, ShhVersion> shhVersion();

    Request<?, ShhNewIdentity> shhNewIdentity();

    Request<?, ShhHasIdentity> shhHasIdentity(String identityAddress);

    Request<?, ShhNewGroup> shhNewGroup();

    Request<?, ShhAddToGroup> shhAddToGroup(String identityAddress);

    Request<?, ShhNewFilter> shhNewFilter(ShhFilter shhFilter);

    Request<?, ShhUninstallFilter> shhUninstallFilter(BigInteger filterId);

    Request<?, ShhMessages> shhGetFilterChanges(BigInteger filterId);

    Request<?, ShhMessages> shhGetMessages(BigInteger filterId);

    BigInteger getBlockNumberCache();

    Request<?, EthGetProofMerkle> ethGetProofMerkle(
            ProofMerkle proofMerkle);
}