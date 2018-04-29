#####################################################################
####   ライブラリインポート 
#####################################################################
import numpy as np
import chainer
from   chainer import Chain
import chainer.functions as F
import chainer.links     as L
from   chainer import datasets, iterators, optimizers, serializers
import argparse


#####################################################################
####   ニューラルネットワーク定義
#####################################################################
class MLP(Chain):
    def __init__(self, n_units):
        super(MLP, self).__init__()            ##pythonは多重継承可能なため、superに引数を指定することがある。
        with self.init_scope():
            self.l1 = L.Linear(None, n_units)  ##入力層
            self.l2 = L.Linear(None, n_units)  ##中間層
            self.l3 = L.Linear(None, 10     )  ##出力層

    def __call__(self, x):
        h1 = F.relu(self.l1(x))
        h2 = F.relu(self.l2(h1))
        return self.l3(h2)


#####################################################################
####   引数の定義
#####################################################################
parser = argparse.ArgumentParser(description='example: MNIST')
parser.add_argument('--batchsize', '-b', type=int, default=100  , help='Number of images in each mini-batch'        )
parser.add_argument('--epoch'    , '-e', type=int, default=20   , help='Number of sweeps over the dataset to train' )
parser.add_argument('--unit'     , '-u', type=int, default=1000 , help='number of units'                            )
parser.add_argument('--gpu'      , '-g', type=int, default=-1   , help='GPU ID(negative value indicates CPU)'       ) 
parser.add_argument('--initmodel', '-m',           default=''   , help='Initialize the model from given file'       )
parser.add_argument('--resume'   , '-r',           default=''   , help='Resume the optimization from snapshot'      )

args = parser.parse_args()


#####################################################################
####   引数で指定された値を標準出力に出力
#####################################################################
print('GPU: {}'.format(args.gpu))
print('# unit: {}'.format(args.unit))
print('# Minibatch-size: {}'.format(args.batchsize))
print('# epoch: {}'.format(args.epoch))


#####################################################################
####   モデルインスタンス作成
#####################################################################
#モデル(MLPクラスのインスタンス)の作成
model = MLP(args.unit)

#モデルをGPUに転送（今回は未使用）
if args.gpu >= 0:
    chainer.cuda.get_device_from_id(args.gpu).use()
    model.to_gpu()







