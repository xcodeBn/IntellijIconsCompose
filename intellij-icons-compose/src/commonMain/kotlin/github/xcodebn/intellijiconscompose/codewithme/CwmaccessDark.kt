package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwmaccessDark: ImageVector
    get() {
        if (_CwmaccessDark != null) return _CwmaccessDark!!

        _CwmaccessDark = ImageVector.Builder(
            name = "CwmaccessDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(15f, 9f)
                moveTo(13f, 12f)
            }
        }.build()

        return _CwmaccessDark!!
    }

private var _CwmaccessDark: ImageVector? = null

