package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowexpandDark: ImageVector
    get() {
        if (_ArrowexpandDark != null) return _ArrowexpandDark!!

        _ArrowexpandDark = ImageVector.Builder(
            name = "ArrowexpandDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFFAFB1B3)),
                strokeLineWidth = 2.0f
            ) {
                moveTo(6f, 13f)
                lineTo(11f, 8f)
                lineTo(6f, 3f)
            }
        }.build()

        return _ArrowexpandDark!!
    }

private var _ArrowexpandDark: ImageVector? = null

