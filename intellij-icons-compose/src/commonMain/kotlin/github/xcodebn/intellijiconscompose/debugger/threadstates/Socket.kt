package github.xcodebn.intellijiconscompose.debugger.threadstates

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Socket: ImageVector
    get() {
        if (_Socket != null) return _Socket!!

        _Socket = ImageVector.Builder(
            name = "Socket",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _Socket!!
    }

private var _Socket: ImageVector? = null

