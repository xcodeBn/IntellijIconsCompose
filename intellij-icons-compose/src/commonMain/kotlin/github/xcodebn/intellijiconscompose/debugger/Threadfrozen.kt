package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Threadfrozen: ImageVector
    get() {
        if (_Threadfrozen != null) return _Threadfrozen!!

        _Threadfrozen = ImageVector.Builder(
            name = "Threadfrozen",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _Threadfrozen!!
    }

private var _Threadfrozen: ImageVector? = null

