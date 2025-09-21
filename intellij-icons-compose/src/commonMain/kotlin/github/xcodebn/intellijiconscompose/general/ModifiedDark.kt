package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ModifiedDark: ImageVector
    get() {
        if (_ModifiedDark != null) return _ModifiedDark!!

        _ModifiedDark = ImageVector.Builder(
            name = "ModifiedDark",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {

        }.build()

        return _ModifiedDark!!
    }

private var _ModifiedDark: ImageVector? = null

