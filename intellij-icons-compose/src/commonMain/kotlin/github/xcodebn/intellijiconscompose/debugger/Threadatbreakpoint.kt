package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Threadatbreakpoint: ImageVector
    get() {
        if (_Threadatbreakpoint != null) return _Threadatbreakpoint!!

        _Threadatbreakpoint = ImageVector.Builder(
            name = "Threadatbreakpoint",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _Threadatbreakpoint!!
    }

private var _Threadatbreakpoint: ImageVector? = null

