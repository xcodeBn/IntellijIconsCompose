package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolwindowmessages: ImageVector
    get() {
        if (_Toolwindowmessages != null) return _Toolwindowmessages!!

        _Toolwindowmessages = ImageVector.Builder(
            name = "Toolwindowmessages",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {

        }.build()

        return _Toolwindowmessages!!
    }

private var _Toolwindowmessages: ImageVector? = null

