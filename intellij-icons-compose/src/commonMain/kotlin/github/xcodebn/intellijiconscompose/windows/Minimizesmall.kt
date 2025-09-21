package github.xcodebn.intellijiconscompose.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Minimizesmall: ImageVector
    get() {
        if (_Minimizesmall != null) return _Minimizesmall!!

        _Minimizesmall = ImageVector.Builder(
            name = "Minimizesmall",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _Minimizesmall!!
    }

private var _Minimizesmall: ImageVector? = null

