package github.xcodebn.intellijiconscompose.toolbardecorator

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ImportDark: ImageVector
    get() {
        if (_ImportDark != null) return _ImportDark!!

        _ImportDark = ImageVector.Builder(
            name = "ImportDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(6f, 4f)
                lineTo(12f, 10f)
                lineTo(6f, 10f)
                close()
            }
        }.build()

        return _ImportDark!!
    }

private var _ImportDark: ImageVector? = null

