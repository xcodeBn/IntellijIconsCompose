package github.xcodebn.intellijiconscompose.ide.shadow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Right: ImageVector
    get() {
        if (_Right != null) return _Right!!

        _Right = ImageVector.Builder(
            name = "Right",
            defaultWidth = 10.0.dp,
            defaultHeight = 4.0.dp,
            viewportWidth = 10.0f,
            viewportHeight = 4.0f
        ).apply {

        }.build()

        return _Right!!
    }

private var _Right: ImageVector? = null

