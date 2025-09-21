package github.xcodebn.intellijiconscompose.objectbrowser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FlattenpackagesDark: ImageVector
    get() {
        if (_FlattenpackagesDark != null) return _FlattenpackagesDark!!

        _FlattenpackagesDark = ImageVector.Builder(
            name = "FlattenpackagesDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(6f, 2f)
                lineTo(9f, 2f)
                lineTo(10f, 3f)
                lineTo(6f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(6f, 9f)
                lineTo(9f, 9f)
                lineTo(10f, 10f)
                lineTo(6f, 10f)
                close()
            }
        }.build()

        return _FlattenpackagesDark!!
    }

private var _FlattenpackagesDark: ImageVector? = null

