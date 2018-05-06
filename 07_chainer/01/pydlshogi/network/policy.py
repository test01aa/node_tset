from chainer import Chain
import chainer.functions as F
import chainer.links     as L

from python-dlshogi.common import *

ch = 192
class PolicyNetwork(Chain):
    def __init__(self):
        super(PolicyNetwork, self).__init__()
        with self.init_scope():
            self.l01 = Convolution2D(in_channels = 104, out_channels = ch, ksize = 3, pad = 1)
            self.l02 = Convolution2D(in_channels = ch , out_channels = ch, ksize = 3, pad = 1)
            self.l03 = Convolution2D(in_channels = ch , out_channels = ch, ksize = 3, pad = 1)
            self.l04 = Convolution2D(in_channels = ch , out_channels = ch, ksize = 3, pad = 1)
            self.l05 = Convolution2D(in_channels = ch , out_channels = ch, ksize = 3, pad = 1)
            self.l06 = Convolution2D(in_channels = ch , out_channels = ch, ksize = 3, pad = 1)
            self.l07 = Convolution2D(in_channels = ch , out_channels = ch, ksize = 3, pad = 1)
            self.l08 = Convolution2D(in_channels = ch , out_channels = ch, ksize = 3, pad = 1)
            self.l09 = Convolution2D(in_channels = ch , out_channels = ch, ksize = 3, pad = 1)
            self.l10 = Convolution2D(in_channels = ch , out_channels = ch, ksize = 3, pad = 1)
            self.l11 = Convolution2D(in_channels = ch , out_channels = ch, ksize = 3, pad = 1)
            self.l12 = Convolution2D(in_channels = ch , out_channels = ch, ksize = 3, pad = 1)
            self.l13 = Convolution2D(in_channels = ch , out_channels = MOVE_DIRECTION_LABEL_NUM , ksize = 1, nobias = True)
            self.l13_bias = L.Bias(shape=(9*9*MOVE_DIRECTION_LABEL_NUM))

    def __call__(self, x):
        h01 = F.relu(self.l01(x) ))
        h02 = F.relu(self.l02(h01))
        h03 = F.relu(self.l03(h02))
        h04 = F.relu(self.l04(h03))
        h05 = F.relu(self.l05(h04))
        h06 = F.relu(self.l06(h05))
        h07 = F.relu(self.l07(h06))
        h08 = F.relu(self.l08(h07))
        h09 = F.relu(self.l09(h08))
        h10 = F.relu(self.l10(h09))
        h11 = F.relu(self.l11(h10))
        h12 = F.relu(self.l12(h11))
        h13 = self.l13(h12) 
        return self.l13_bias(F.reshape(h13,(-1,9*9*MOVE_DIRECTION_LABEL_NUM)))





