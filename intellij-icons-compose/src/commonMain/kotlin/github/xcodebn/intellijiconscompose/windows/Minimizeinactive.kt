package github.xcodebn.intellijiconscompose.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Minimizeinactive: ImageVector
    get() {
        if (_Minimizeinactive != null) return _Minimizeinactive!!

        _Minimizeinactive = ImageVector.Builder(
            name = "Minimizeinactive",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _Minimizeinactive!!
    }

private var _Minimizeinactive: ImageVector? = null

