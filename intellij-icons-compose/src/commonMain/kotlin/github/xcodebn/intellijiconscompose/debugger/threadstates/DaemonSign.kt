package github.xcodebn.intellijiconscompose.debugger.threadstates

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DaemonSign: ImageVector
    get() {
        if (_DaemonSign != null) return _DaemonSign!!

        _DaemonSign = ImageVector.Builder(
            name = "DaemonSign",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _DaemonSign!!
    }

private var _DaemonSign: ImageVector? = null

