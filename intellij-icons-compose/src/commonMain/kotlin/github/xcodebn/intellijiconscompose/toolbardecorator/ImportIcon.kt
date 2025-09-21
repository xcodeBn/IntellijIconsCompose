package github.xcodebn.intellijiconscompose.toolbardecorator

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ImportIcon: ImageVector
    get() {
        if (_ImportIcon != null) return _ImportIcon!!

        _ImportIcon = ImageVector.Builder(
            name = "ImportIcon",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 3f)
                lineTo(6f, 9f)
                lineTo(0f, 9f)
                close()
            }
        }.build()

        return _ImportIcon!!
    }

private var _ImportIcon: ImageVector? = null

