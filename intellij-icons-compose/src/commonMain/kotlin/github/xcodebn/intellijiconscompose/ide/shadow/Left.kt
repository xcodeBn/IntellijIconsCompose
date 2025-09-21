package github.xcodebn.intellijiconscompose.ide.shadow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Left: ImageVector
    get() {
        if (_Left != null) return _Left!!

        _Left = ImageVector.Builder(
            name = "Left",
            defaultWidth = 10.0.dp,
            defaultHeight = 4.0.dp,
            viewportWidth = 10.0f,
            viewportHeight = 4.0f
        ).apply {

        }.build()

        return _Left!!
    }

private var _Left: ImageVector? = null

